package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCodeDeployBlueGreenEcsAttributes {

  def apply(
    taskDefinitions: List[String],
    taskSets: List[String],
    trafficRouting: software.amazon.awscdk.CfnTrafficRouting
  ): software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes =
    (new software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes.Builder)
      .taskDefinitions(taskDefinitions.asJava)
      .taskSets(taskSets.asJava)
      .trafficRouting(trafficRouting)
      .build()
}
