package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FairsharePolicyProperty {

  def apply(
    shareDecaySeconds: Option[Number] = None,
    computeReservation: Option[Number] = None,
    shareDistribution: Option[List[_]] = None
  ): software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty =
    (new software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty.Builder)
      .shareDecaySeconds(shareDecaySeconds.orNull)
      .computeReservation(computeReservation.orNull)
      .shareDistribution(shareDistribution.map(_.asJava).orNull)
      .build()
}
