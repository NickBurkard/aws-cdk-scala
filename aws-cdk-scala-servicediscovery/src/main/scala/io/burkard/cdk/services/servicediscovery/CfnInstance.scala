package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnInstance {

  def apply(
    internalResourceId: String,
    instanceId: Option[String] = None,
    instanceAttributes: Option[AnyRef] = None,
    serviceId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicediscovery.CfnInstance =
    software.amazon.awscdk.services.servicediscovery.CfnInstance.Builder
      .create(stackCtx, internalResourceId)
      .instanceId(instanceId.orNull)
      .instanceAttributes(instanceAttributes.orNull)
      .serviceId(serviceId.orNull)
      .build()
}
