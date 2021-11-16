package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCapacityReservation {

  def apply(
    internalResourceId: String,
    instanceType: String,
    instanceCount: Number,
    instancePlatform: String,
    availabilityZone: String,
    ebsOptimized: Option[Boolean] = None,
    tagSpecifications: Option[List[_]] = None,
    endDate: Option[String] = None,
    ephemeralStorage: Option[Boolean] = None,
    tenancy: Option[String] = None,
    endDateType: Option[String] = None,
    instanceMatchCriteria: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnCapacityReservation =
    software.amazon.awscdk.services.ec2.CfnCapacityReservation.Builder
      .create(stackCtx, internalResourceId)
      .instanceType(instanceType)
      .instanceCount(instanceCount)
      .instancePlatform(instancePlatform)
      .availabilityZone(availabilityZone)
      .ebsOptimized(ebsOptimized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tagSpecifications(tagSpecifications.map(_.asJava).orNull)
      .endDate(endDate.orNull)
      .ephemeralStorage(ephemeralStorage.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tenancy(tenancy.orNull)
      .endDateType(endDateType.orNull)
      .instanceMatchCriteria(instanceMatchCriteria.orNull)
      .build()
}
