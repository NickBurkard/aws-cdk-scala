package io.burkard.cdk

import software.amazon.awscdk.StackProps

/**
 * CDK stack.
 * @param id Optional stack ID.
 * @param props Optional stack properties.
 * @param appCtx CDK app context.
 */
abstract class Stack(
  id: Option[String] = None,
  props: Option[StackProps] = None
)(implicit
  appCtx: App
) extends CdkStack(appCtx, id.orNull, props.orNull)  {

  // Context for initializing stack resources.
  protected[this] implicit lazy val stackCtx: CdkStack = this
}
