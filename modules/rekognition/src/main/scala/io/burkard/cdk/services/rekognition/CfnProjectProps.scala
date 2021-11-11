package io.burkard.cdk.services.rekognition

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProjectProps {

  def apply(
    projectName: Option[String] = None
  ): software.amazon.awscdk.services.rekognition.CfnProjectProps =
    (new software.amazon.awscdk.services.rekognition.CfnProjectProps.Builder)
      .projectName(projectName.orNull)
      .build()
}