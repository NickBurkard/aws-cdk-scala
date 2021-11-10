package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApiEventProperty {

  def apply(
    method: Option[String] = None,
    path: Option[String] = None,
    auth: Option[software.amazon.awscdk.services.sam.CfnFunction.AuthProperty] = None,
    restApiId: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.Builder)
      .method(method.orNull)
      .path(path.orNull)
      .auth(auth.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
