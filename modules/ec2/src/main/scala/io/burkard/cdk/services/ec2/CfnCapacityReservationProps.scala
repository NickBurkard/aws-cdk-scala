package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCapacityReservationProps {

  def apply(
    ebsOptimized: Option[Boolean] = None,
    tagSpecifications: Option[List[_]] = None,
    endDate: Option[String] = None,
    instanceType: Option[String] = None,
    ephemeralStorage: Option[Boolean] = None,
    tenancy: Option[String] = None,
    instanceCount: Option[Number] = None,
    endDateType: Option[String] = None,
    instancePlatform: Option[String] = None,
    availabilityZone: Option[String] = None,
    instanceMatchCriteria: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnCapacityReservationProps =
    (new software.amazon.awscdk.services.ec2.CfnCapacityReservationProps.Builder)
      .ebsOptimized(ebsOptimized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tagSpecifications(tagSpecifications.map(_.asJava).orNull)
      .endDate(endDate.orNull)
      .instanceType(instanceType.orNull)
      .ephemeralStorage(ephemeralStorage.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tenancy(tenancy.orNull)
      .instanceCount(instanceCount.orNull)
      .endDateType(endDateType.orNull)
      .instancePlatform(instancePlatform.orNull)
      .availabilityZone(availabilityZone.orNull)
      .instanceMatchCriteria(instanceMatchCriteria.orNull)
      .build()
}
