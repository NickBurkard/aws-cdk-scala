package io.burkard.cdk.services.lookoutvision

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnProjectProps {

  def apply(
    projectName: Option[String] = None
  ): software.amazon.awscdk.services.lookoutvision.CfnProjectProps =
    (new software.amazon.awscdk.services.lookoutvision.CfnProjectProps.Builder)
      .projectName(projectName.orNull)
      .build()
}
