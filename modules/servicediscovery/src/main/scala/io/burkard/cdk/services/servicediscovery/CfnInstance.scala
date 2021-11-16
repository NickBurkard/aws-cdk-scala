package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstance {

  def apply(
    internalResourceId: String,
    instanceAttributes: AnyRef,
    serviceId: String,
    instanceId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicediscovery.CfnInstance =
    software.amazon.awscdk.services.servicediscovery.CfnInstance.Builder
      .create(stackCtx, internalResourceId)
      .instanceAttributes(instanceAttributes)
      .serviceId(serviceId)
      .instanceId(instanceId.orNull)
      .build()
}
