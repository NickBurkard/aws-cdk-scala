package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CrossAccountDestination {

  def apply(
    internalResourceId: String,
    role: software.amazon.awscdk.services.iam.IRole,
    targetArn: String,
    destinationName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CrossAccountDestination =
    software.amazon.awscdk.services.logs.CrossAccountDestination.Builder
      .create(stackCtx, internalResourceId)
      .role(role)
      .targetArn(targetArn)
      .destinationName(destinationName.orNull)
      .build()
}
