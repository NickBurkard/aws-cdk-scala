package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApiEventProperty {

  def apply(
    method: String,
    path: String,
    restApiId: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty.Builder)
      .method(method)
      .path(path)
      .restApiId(restApiId.orNull)
      .build()
}
