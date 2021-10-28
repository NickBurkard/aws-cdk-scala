package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnJson {

  def apply(
    internalResourceId: String,
    value: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnJson =
    software.amazon.awscdk.CfnJson.Builder
      .create(stackCtx, internalResourceId)
      .value(value.orNull)
      .build()
}
