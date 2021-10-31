package io.burkard.cdk.services.cloudformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OperationPreferencesProperty {

  def apply(
    regionConcurrencyType: Option[String] = None,
    maxConcurrentCount: Option[Number] = None,
    failureToleranceCount: Option[Number] = None,
    regionOrder: Option[List[String]] = None,
    maxConcurrentPercentage: Option[Number] = None,
    failureTolerancePercentage: Option[Number] = None
  ): software.amazon.awscdk.services.cloudformation.CfnStackSet.OperationPreferencesProperty =
    (new software.amazon.awscdk.services.cloudformation.CfnStackSet.OperationPreferencesProperty.Builder)
      .regionConcurrencyType(regionConcurrencyType.orNull)
      .maxConcurrentCount(maxConcurrentCount.orNull)
      .failureToleranceCount(failureToleranceCount.orNull)
      .regionOrder(regionOrder.map(_.asJava).orNull)
      .maxConcurrentPercentage(maxConcurrentPercentage.orNull)
      .failureTolerancePercentage(failureTolerancePercentage.orNull)
      .build()
}
