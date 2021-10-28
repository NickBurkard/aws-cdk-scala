package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCodeDeployBlueGreenEcsAttributes {

  def apply(
    taskDefinitions: Option[List[String]] = None,
    taskSets: Option[List[String]] = None,
    trafficRouting: Option[software.amazon.awscdk.CfnTrafficRouting] = None
  ): software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes =
    (new software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes.Builder)
      .taskDefinitions(taskDefinitions.map(_.asJava).orNull)
      .taskSets(taskSets.map(_.asJava).orNull)
      .trafficRouting(trafficRouting.orNull)
      .build()
}
