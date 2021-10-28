package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EcsApplication {

  def apply(
    internalResourceId: String,
    applicationName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codedeploy.EcsApplication =
    software.amazon.awscdk.services.codedeploy.EcsApplication.Builder
      .create(stackCtx, internalResourceId)
      .applicationName(applicationName.orNull)
      .build()
}
