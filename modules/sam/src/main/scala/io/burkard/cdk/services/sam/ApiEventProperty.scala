package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApiEventProperty {

  def apply(
    method: Option[String] = None,
    path: Option[String] = None,
    restApiId: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty.Builder)
      .method(method.orNull)
      .path(path.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
