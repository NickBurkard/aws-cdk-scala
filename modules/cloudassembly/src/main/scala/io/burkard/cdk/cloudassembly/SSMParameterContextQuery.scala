package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SSMParameterContextQuery {

  def apply(
    account: String,
    region: String,
    parameterName: String,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery.Builder)
      .account(account)
      .region(region)
      .parameterName(parameterName)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
