package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCapacityReservationFleetProps {

  def apply(
    allocationStrategy: Option[String] = None,
    endDate: Option[String] = None,
    noRemoveEndDate: Option[Boolean] = None,
    totalTargetCapacity: Option[Number] = None,
    tenancy: Option[String] = None,
    tagSpecifications: Option[List[_]] = None,
    instanceTypeSpecifications: Option[List[_]] = None,
    instanceMatchCriteria: Option[String] = None,
    removeEndDate: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps =
    (new software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps.Builder)
      .allocationStrategy(allocationStrategy.orNull)
      .endDate(endDate.orNull)
      .noRemoveEndDate(noRemoveEndDate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .totalTargetCapacity(totalTargetCapacity.orNull)
      .tenancy(tenancy.orNull)
      .tagSpecifications(tagSpecifications.map(_.asJava).orNull)
      .instanceTypeSpecifications(instanceTypeSpecifications.map(_.asJava).orNull)
      .instanceMatchCriteria(instanceMatchCriteria.orNull)
      .removeEndDate(removeEndDate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
