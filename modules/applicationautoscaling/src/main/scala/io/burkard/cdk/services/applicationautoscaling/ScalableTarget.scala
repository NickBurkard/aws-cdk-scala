package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalableTarget {

  def apply(
    internalResourceId: String,
    maxCapacity: Number,
    serviceNamespace: software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace,
    minCapacity: Number,
    scalableDimension: String,
    resourceId: String,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.applicationautoscaling.ScalableTarget =
    software.amazon.awscdk.services.applicationautoscaling.ScalableTarget.Builder
      .create(stackCtx, internalResourceId)
      .maxCapacity(maxCapacity)
      .serviceNamespace(serviceNamespace)
      .minCapacity(minCapacity)
      .scalableDimension(scalableDimension)
      .resourceId(resourceId)
      .role(role.orNull)
      .build()
}
