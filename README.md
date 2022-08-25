# NaTour

<H2>What is NaTour?</H2>
NaTour is a complex and distributed system aimed at offering a modern social network to hiking lovers. The system consists of a secure, high-performance and scalable back-end (built with Spring Boot and cloud-based technologies) and a mobile client (Android) through which users can take advantage of the system's features in an intuitive, fast and pleasant way.

<H2>What are the system's functionalities?</H2>

<ul>
  <li>
    A user can register/authenticate (even with third-party authentication e.g. Google and Facebook). This functionality was realized using <a    href="https://www.keycloak.org/">Keycloak</a> (Open Source Identity and Access Management).
    <br><br>
    <img src="https://github.com/vtramo/NaTour/blob/main/images/login.gif?raw=true" height="500"/>
    <img src="https://github.com/vtramo/NaTour/blob/main/images/register.jpeg?raw=true" height="500"/>
  </li>
  
  <br>
  
  <li>
    An authenticated user can view all trails uploaded to the system.
    <br><br>
    <img src="https://github.com/vtramo/NaTour/blob/main/images/home.gif?raw=true" height="500"/>
  </li>
  
  <br>
  
  <li>
    An authenticated user can enter new trails into the platform. A trail is characterized by a name, a duration, a level of difficulty, a starting point, a description (optional), and a geographic trail (optional) that represents it on a map. The geographic trail must be either manually entered (by interacting with an interactive map) or via file in standard GPX format.
    <br><br>
    <image src="https://github.com/vtramo/NaTour/blob/main/images/route_creation.gif?raw=true" height="500"/>
    <image src="https://github.com/vtramo/NaTour/blob/main/images/route_creation_gpx.gif?raw=true" height="500"/>
  </li>
</ul>
