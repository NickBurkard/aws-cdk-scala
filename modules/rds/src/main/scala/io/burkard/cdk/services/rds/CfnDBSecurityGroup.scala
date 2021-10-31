package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBSecurityGroup {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    groupDescription: Option[String] = None,
    dbSecurityGroupIngress: Option[List[_]] = None,
    ec2VpcId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.CfnDBSecurityGroup =
    software.amazon.awscdk.services.rds.CfnDBSecurityGroup.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .groupDescription(groupDescription.orNull)
      .dbSecurityGroupIngress(dbSecurityGroupIngress.map(_.asJava).orNull)
      .ec2VpcId(ec2VpcId.orNull)
      .build()
}
