package io.burkard.cdk.services.amplify

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApp {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    repository: Option[String] = None,
    environmentVariables: Option[List[_]] = None,
    oauthToken: Option[String] = None,
    basicAuthConfig: Option[software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty] = None,
    customRules: Option[List[_]] = None,
    customHeaders: Option[String] = None,
    autoBranchCreationConfig: Option[software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty] = None,
    enableBranchAutoDeletion: Option[Boolean] = None,
    accessToken: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    iamServiceRole: Option[String] = None,
    buildSpec: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.amplify.CfnApp =
    software.amazon.awscdk.services.amplify.CfnApp.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .repository(repository.orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .oauthToken(oauthToken.orNull)
      .basicAuthConfig(basicAuthConfig.orNull)
      .customRules(customRules.map(_.asJava).orNull)
      .customHeaders(customHeaders.orNull)
      .autoBranchCreationConfig(autoBranchCreationConfig.orNull)
      .enableBranchAutoDeletion(enableBranchAutoDeletion.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .accessToken(accessToken.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .iamServiceRole(iamServiceRole.orNull)
      .buildSpec(buildSpec.orNull)
      .build()
}
