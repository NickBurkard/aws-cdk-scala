package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBSecurityGroup {

  def apply(
    internalResourceId: String,
    groupDescription: String,
    dbSecurityGroupIngress: List[_],
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    ec2VpcId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.CfnDBSecurityGroup =
    software.amazon.awscdk.services.rds.CfnDBSecurityGroup.Builder
      .create(stackCtx, internalResourceId)
      .groupDescription(groupDescription)
      .dbSecurityGroupIngress(dbSecurityGroupIngress.asJava)
      .tags(tags.map(_.asJava).orNull)
      .ec2VpcId(ec2VpcId.orNull)
      .build()
}
