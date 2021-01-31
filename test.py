class Solution:
    def dfs(self,heights,row,col,visited,prev_height,max_effort_in_path):
        # out of bounds
        if row < 0 or col < 0 or row >= len(heights) or col >= len(heights[0]) or (row,col) in visited:
            return
        
        # end early
        if max_effort_in_path > self.min_eff:
            return
        
        #print((row,col))
        step = abs(heights[row][col]-prev_height)
        max_effort_in_path = max(max_effort_in_path,step)

        # base case: reaching the bottom right
        if row==len(heights)-1 and col==len(heights[0])-1:
            self.min_eff = min(self.min_eff,max_effort_in_path)
            #print(max_effort_in_path,path)
            return
        
        # add in visited
        visited.add((row,col))
        
        # recursive calls
        # up
        self.dfs(heights,row-1,col,visited,heights[row][col],max_effort_in_path)
        # right
        self.dfs(heights,row,col+1,visited,heights[row][col],max_effort_in_path)
        # down
        self.dfs(heights,row+1,col,visited,heights[row][col],max_effort_in_path)
        # left
        self.dfs(heights,row,col-1,visited,heights[row][col],max_effort_in_path)
        
        # draw back
        visited.remove((row,col))
        
    def minimumEffortPath(self, heights):
        '''
        dfs all paths
        
        return minimum effort
        '''
        # only 1 row
        if len(heights)==1:
            res = 0
            for i in range(1,len(heights[0])):
                effort = abs(heights[0][i]-heights[0][i-1])
                res = max(res,effort)
            return res
        
        self.min_eff = float('inf')
        visited = set()
        self.dfs(heights,0,0,visited,heights[0][0],0)
        
        return self.min_eff
        
heights=[[8,3,2,5,2,10,7,1,8,9],[1,4,9,1,10,2,4,10,3,5],[4,10,10,3,6,1,3,9,8,8],[4,4,6,10,10,10,2,10,8,8],[9,10,2,4,1,2,2,6,5,7],[2,9,2,6,1,4,7,6,10,9],[8,8,2,10,8,2,3,9,5,3],[2,10,9,3,5,1,7,4,5,6],[2,3,9,2,5,10,2,7,1,8],[9,10,4,10,7,4,9,3,1,6]]
a = Solution().minimumEffortPath(heights)

print(a)