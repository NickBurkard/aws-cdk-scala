package io.burkard.cdk.customresources

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Provider {

  def apply(
    internalResourceId: String,
    logRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    onEventHandler: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    totalTimeout: Option[software.amazon.awscdk.Duration] = None,
    queryInterval: Option[software.amazon.awscdk.Duration] = None,
    isCompleteHandler: Option[software.amazon.awscdk.services.lambda.IFunction] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.customresources.Provider =
    software.amazon.awscdk.customresources.Provider.Builder
      .create(stackCtx, internalResourceId)
      .logRetention(logRetention.orNull)
      .role(role.orNull)
      .onEventHandler(onEventHandler.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .totalTimeout(totalTimeout.orNull)
      .queryInterval(queryInterval.orNull)
      .isCompleteHandler(isCompleteHandler.orNull)
      .build()
}
