package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OperationPreferencesProperty {

  def apply(
    regionConcurrencyType: Option[String] = None,
    maxConcurrentCount: Option[Number] = None,
    failureToleranceCount: Option[Number] = None,
    regionOrder: Option[List[String]] = None,
    maxConcurrentPercentage: Option[Number] = None,
    failureTolerancePercentage: Option[Number] = None
  ): software.amazon.awscdk.CfnStackSet.OperationPreferencesProperty =
    (new software.amazon.awscdk.CfnStackSet.OperationPreferencesProperty.Builder)
      .regionConcurrencyType(regionConcurrencyType.orNull)
      .maxConcurrentCount(maxConcurrentCount.orNull)
      .failureToleranceCount(failureToleranceCount.orNull)
      .regionOrder(regionOrder.map(_.asJava).orNull)
      .maxConcurrentPercentage(maxConcurrentPercentage.orNull)
      .failureTolerancePercentage(failureTolerancePercentage.orNull)
      .build()
}
