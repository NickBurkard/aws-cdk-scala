package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceDefaultVersionProps {

  def apply(
    versionId: Option[String] = None,
    typeName: Option[String] = None,
    typeVersionArn: Option[String] = None
  ): software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps =
    (new software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps.Builder)
      .versionId(versionId.orNull)
      .typeName(typeName.orNull)
      .typeVersionArn(typeVersionArn.orNull)
      .build()
}
