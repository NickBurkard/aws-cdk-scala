package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTagOption {

  def apply(
    internalResourceId: String,
    key: String,
    value: String,
    active: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnTagOption =
    software.amazon.awscdk.services.servicecatalog.CfnTagOption.Builder
      .create(stackCtx, internalResourceId)
      .key(key)
      .value(value)
      .active(active.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
