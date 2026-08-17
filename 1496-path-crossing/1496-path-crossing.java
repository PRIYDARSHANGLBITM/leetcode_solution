class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        HashSet<String> visited = new HashSet<>();
        visited.add("0,0");
        for(int i=0;i<path.length();i++){
            char direction = path.charAt(i);
            if(direction == 'S'){
                y++;
            }
            else if(direction == 'N'){
                y--;
            }
            else if(direction == 'E'){
                x++;
            }
            else{
                x--;
            }
            String position = x +","+ y;
            if(visited.contains(position)){
                return true;
            }
            visited.add(position);
        }
        return false;
    }
}