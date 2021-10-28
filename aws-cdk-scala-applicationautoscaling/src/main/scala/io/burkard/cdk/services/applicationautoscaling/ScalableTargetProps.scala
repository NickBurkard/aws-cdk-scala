package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScalableTargetProps {

  def apply(
    maxCapacity: Option[Number] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    serviceNamespace: Option[software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace] = None,
    minCapacity: Option[Number] = None,
    scalableDimension: Option[String] = None,
    resourceId: Option[String] = None
  ): software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps =
    (new software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder)
      .maxCapacity(maxCapacity.orNull)
      .role(role.orNull)
      .serviceNamespace(serviceNamespace.orNull)
      .minCapacity(minCapacity.orNull)
      .scalableDimension(scalableDimension.orNull)
      .resourceId(resourceId.orNull)
      .build()
}
