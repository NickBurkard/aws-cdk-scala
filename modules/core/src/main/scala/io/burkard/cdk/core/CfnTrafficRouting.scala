package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrafficRouting {

  def apply(
    testTrafficRoute: software.amazon.awscdk.CfnTrafficRoute,
    targetGroups: List[String],
    prodTrafficRoute: software.amazon.awscdk.CfnTrafficRoute
  ): software.amazon.awscdk.CfnTrafficRouting =
    (new software.amazon.awscdk.CfnTrafficRouting.Builder)
      .testTrafficRoute(testTrafficRoute)
      .targetGroups(targetGroups.asJava)
      .prodTrafficRoute(prodTrafficRoute)
      .build()
}
