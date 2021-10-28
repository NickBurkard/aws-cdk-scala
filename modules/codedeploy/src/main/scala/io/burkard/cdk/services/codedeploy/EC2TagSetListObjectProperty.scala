package io.burkard.cdk.services.codedeploy

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EC2TagSetListObjectProperty {

  def apply(
    ec2TagGroup: Option[List[_]] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty.Builder)
      .ec2TagGroup(ec2TagGroup.map(_.asJava).orNull)
      .build()
}
