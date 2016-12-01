/**
 * File Name: Main.java
 * 
 * Copyright (c) 2016 BISON Schweiz AG, All Rights Reserved.
 */

package tech.bison.dummy.adapter;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

/**
 * TD2:joachim.huber Auto-generated comment for class
 *
 * @author joachim.huber
 */
public class Main {

  public static void main(String[] args) throws Exception {

    final Swarm swarm = new Swarm();
    final JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
    deployment.addPackages(true, Main.class.getPackage());
    deployment.addAllDependencies(false);

    swarm.start().deploy(deployment);
  }

}
