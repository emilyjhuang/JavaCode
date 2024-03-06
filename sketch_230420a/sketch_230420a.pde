PImage front;
PImage back;

void setup()
{
  size(339,508);
  front = loadImage("front.jpeg");
  back = loadImage("back.jpeg");
}
void draw(){
  background(back);
  tint(255,177);
  // tint(255); (tint red and transparant)
  image(front,0,0);
  
}
