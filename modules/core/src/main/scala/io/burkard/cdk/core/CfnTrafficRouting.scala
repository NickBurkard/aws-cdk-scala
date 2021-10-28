package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTrafficRouting {

  def apply(
    testTrafficRoute: Option[software.amazon.awscdk.CfnTrafficRoute] = None,
    targetGroups: Option[List[String]] = None,
    prodTrafficRoute: Option[software.amazon.awscdk.CfnTrafficRoute] = None
  ): software.amazon.awscdk.CfnTrafficRouting =
    (new software.amazon.awscdk.CfnTrafficRouting.Builder)
      .testTrafficRoute(testTrafficRoute.orNull)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .prodTrafficRoute(prodTrafficRoute.orNull)
      .build()
}
