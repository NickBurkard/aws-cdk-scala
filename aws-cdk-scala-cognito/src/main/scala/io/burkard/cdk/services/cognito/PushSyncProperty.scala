package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PushSyncProperty {

  def apply(
    applicationArns: Option[List[String]] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty =
    (new software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty.Builder)
      .applicationArns(applicationArns.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .build()
}
