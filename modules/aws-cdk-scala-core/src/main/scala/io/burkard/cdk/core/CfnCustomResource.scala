package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCustomResource {

  def apply(
    internalResourceId: String,
    serviceToken: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnCustomResource =
    software.amazon.awscdk.CfnCustomResource.Builder
      .create(stackCtx, internalResourceId)
      .serviceToken(serviceToken.orNull)
      .build()
}
