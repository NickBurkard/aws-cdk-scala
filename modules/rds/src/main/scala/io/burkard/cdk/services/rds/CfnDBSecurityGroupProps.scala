package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBSecurityGroupProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    groupDescription: Option[String] = None,
    dbSecurityGroupIngress: Option[List[_]] = None,
    ec2VpcId: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps =
    (new software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .groupDescription(groupDescription.orNull)
      .dbSecurityGroupIngress(dbSecurityGroupIngress.map(_.asJava).orNull)
      .ec2VpcId(ec2VpcId.orNull)
      .build()
}
