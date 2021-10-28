package io.burkard.cdk.services.codedeploy

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EC2TagSetProperty {

  def apply(
    ec2TagSetList: Option[List[_]] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty.Builder)
      .ec2TagSetList(ec2TagSetList.map(_.asJava).orNull)
      .build()
}
