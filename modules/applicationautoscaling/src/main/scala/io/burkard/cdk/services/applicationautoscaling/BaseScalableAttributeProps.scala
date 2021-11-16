package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaseScalableAttributeProps {

  def apply(
    resourceId: String,
    role: software.amazon.awscdk.services.iam.IRole,
    serviceNamespace: software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace,
    dimension: String,
    maxCapacity: Option[Number] = None,
    minCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps =
    (new software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder)
      .resourceId(resourceId)
      .role(role)
      .serviceNamespace(serviceNamespace)
      .dimension(dimension)
      .maxCapacity(maxCapacity.orNull)
      .minCapacity(minCapacity.orNull)
      .build()
}
