package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBSecurityGroupProps {

  def apply(
    groupDescription: String,
    dbSecurityGroupIngress: List[_],
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    ec2VpcId: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps =
    (new software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps.Builder)
      .groupDescription(groupDescription)
      .dbSecurityGroupIngress(dbSecurityGroupIngress.asJava)
      .tags(tags.map(_.asJava).orNull)
      .ec2VpcId(ec2VpcId.orNull)
      .build()
}
