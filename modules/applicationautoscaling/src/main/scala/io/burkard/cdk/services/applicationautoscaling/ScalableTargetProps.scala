package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalableTargetProps {

  def apply(
    maxCapacity: Number,
    serviceNamespace: software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace,
    minCapacity: Number,
    scalableDimension: String,
    resourceId: String,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps =
    (new software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder)
      .maxCapacity(maxCapacity)
      .serviceNamespace(serviceNamespace)
      .minCapacity(minCapacity)
      .scalableDimension(scalableDimension)
      .resourceId(resourceId)
      .role(role.orNull)
      .build()
}
