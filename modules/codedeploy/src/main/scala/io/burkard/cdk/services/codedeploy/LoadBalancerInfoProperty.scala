package io.burkard.cdk.services.codedeploy

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoadBalancerInfoProperty {

  def apply(
    targetGroupInfoList: Option[List[_]] = None,
    elbInfoList: Option[List[_]] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty.Builder)
      .targetGroupInfoList(targetGroupInfoList.map(_.asJava).orNull)
      .elbInfoList(elbInfoList.map(_.asJava).orNull)
      .build()
}
