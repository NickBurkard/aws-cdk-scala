package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApiEventProperty {

  def apply(
    method: String,
    path: String,
    auth: Option[software.amazon.awscdk.services.sam.CfnFunction.AuthProperty] = None,
    restApiId: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.Builder)
      .method(method)
      .path(path)
      .auth(auth.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
