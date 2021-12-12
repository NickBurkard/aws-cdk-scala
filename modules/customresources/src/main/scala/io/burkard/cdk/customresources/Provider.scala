package io.burkard.cdk.customresources

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Provider {

  def apply(
    internalResourceId: String,
    onEventHandler: software.amazon.awscdk.services.lambda.IFunction,
    logRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    providerFunctionName: Option[String] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    totalTimeout: Option[software.amazon.awscdk.Duration] = None,
    queryInterval: Option[software.amazon.awscdk.Duration] = None,
    isCompleteHandler: Option[software.amazon.awscdk.services.lambda.IFunction] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.customresources.Provider =
    software.amazon.awscdk.customresources.Provider.Builder
      .create(stackCtx, internalResourceId)
      .onEventHandler(onEventHandler)
      .logRetention(logRetention.orNull)
      .role(role.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .providerFunctionName(providerFunctionName.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .totalTimeout(totalTimeout.orNull)
      .queryInterval(queryInterval.orNull)
      .isCompleteHandler(isCompleteHandler.orNull)
      .build()
}
