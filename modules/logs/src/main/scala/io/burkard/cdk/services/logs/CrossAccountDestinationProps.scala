package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CrossAccountDestinationProps {

  def apply(
    role: software.amazon.awscdk.services.iam.IRole,
    targetArn: String,
    destinationName: Option[String] = None
  ): software.amazon.awscdk.services.logs.CrossAccountDestinationProps =
    (new software.amazon.awscdk.services.logs.CrossAccountDestinationProps.Builder)
      .role(role)
      .targetArn(targetArn)
      .destinationName(destinationName.orNull)
      .build()
}
