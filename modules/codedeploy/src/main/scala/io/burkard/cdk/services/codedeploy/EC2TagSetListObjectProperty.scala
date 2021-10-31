package io.burkard.cdk.services.codedeploy

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EC2TagSetListObjectProperty {

  def apply(
    ec2TagGroup: Option[List[_]] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty.Builder)
      .ec2TagGroup(ec2TagGroup.map(_.asJava).orNull)
      .build()
}
