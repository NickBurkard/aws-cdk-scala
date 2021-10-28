package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CrossAccountDestination {

  def apply(
    internalResourceId: String,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    targetArn: Option[String] = None,
    destinationName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CrossAccountDestination =
    software.amazon.awscdk.services.logs.CrossAccountDestination.Builder
      .create(stackCtx, internalResourceId)
      .role(role.orNull)
      .targetArn(targetArn.orNull)
      .destinationName(destinationName.orNull)
      .build()
}
