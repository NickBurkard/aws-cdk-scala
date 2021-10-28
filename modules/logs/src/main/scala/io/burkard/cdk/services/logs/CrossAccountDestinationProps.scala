package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CrossAccountDestinationProps {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    targetArn: Option[String] = None,
    destinationName: Option[String] = None
  ): software.amazon.awscdk.services.logs.CrossAccountDestinationProps =
    (new software.amazon.awscdk.services.logs.CrossAccountDestinationProps.Builder)
      .role(role.orNull)
      .targetArn(targetArn.orNull)
      .destinationName(destinationName.orNull)
      .build()
}
