package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnJson {

  def apply(
    internalResourceId: String,
    value: AnyRef
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnJson =
    software.amazon.awscdk.CfnJson.Builder
      .create(stackCtx, internalResourceId)
      .value(value)
      .build()
}
