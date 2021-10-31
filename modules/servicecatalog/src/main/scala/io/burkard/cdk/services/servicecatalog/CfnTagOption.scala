package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTagOption {

  def apply(
    internalResourceId: String,
    key: Option[String] = None,
    value: Option[String] = None,
    active: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnTagOption =
    software.amazon.awscdk.services.servicecatalog.CfnTagOption.Builder
      .create(stackCtx, internalResourceId)
      .key(key.orNull)
      .value(value.orNull)
      .active(active.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
