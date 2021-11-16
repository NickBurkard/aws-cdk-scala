package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseProxyAttributes {

  def apply(
    dbProxyArn: String,
    dbProxyName: String,
    securityGroups: List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup],
    endpoint: String
  ): software.amazon.awscdk.services.rds.DatabaseProxyAttributes =
    (new software.amazon.awscdk.services.rds.DatabaseProxyAttributes.Builder)
      .dbProxyArn(dbProxyArn)
      .dbProxyName(dbProxyName)
      .securityGroups(securityGroups.asJava)
      .endpoint(endpoint)
      .build()
}
