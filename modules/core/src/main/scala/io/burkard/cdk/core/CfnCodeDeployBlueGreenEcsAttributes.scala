package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
