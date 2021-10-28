package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScalableTaskCount {

  def apply(
    internalResourceId: String,
    resourceId: Option[String] = None,
    maxCapacity: Option[Number] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    serviceNamespace: Option[software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace] = None,
    minCapacity: Option[Number] = None,
    dimension: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.ScalableTaskCount =
    software.amazon.awscdk.services.ecs.ScalableTaskCount.Builder
      .create(stackCtx, internalResourceId)
      .resourceId(resourceId.orNull)
      .maxCapacity(maxCapacity.orNull)
      .role(role.orNull)
      .serviceNamespace(serviceNamespace.orNull)
      .minCapacity(minCapacity.orNull)
      .dimension(dimension.orNull)
      .build()
}
